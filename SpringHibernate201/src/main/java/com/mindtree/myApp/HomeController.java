package com.mindtree.myApp;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.DescriptionTypeEntity;
import com.mindtree.entity.PropertyEntity;
import com.mindtree.entity.RequestDto;
import com.mindtree.entity.ZoneEntity;
import com.mindtree.repository.DescriptionRepository;
import com.mindtree.repository.PropertyRepository;
import com.mindtree.repository.ZoneRepository;

@RestController
public class HomeController {

	@Autowired
	ZoneRepository zoneRepository;

	@Autowired
	DescriptionRepository descriptionRepository;

	@Autowired
	PropertyRepository propertyRepository;

	@GetMapping("/")
	public String home(Map<String, Object> model) {
		return "myview";
	}

	@GetMapping("/taskView")
	public ModelAndView viewPageLoad() {

		zoneRepository.findAll();

		return new ModelAndView("myview");
	}

	@GetMapping("/view")
	@ResponseBody
	public List<ZoneEntity> viewRecords() {

		return zoneRepository.findAll();

	}

	@GetMapping("/addTax")
	public ModelAndView addTax() {
		return new ModelAndView("addtax");
	}

	@GetMapping("/all")
	@ResponseBody
	public List<String> getAllZone() {
		List<String> zonesList = new ArrayList<>();

		List<ZoneEntity> listOfZone = zoneRepository.findAll();

		listOfZone.forEach(o -> {
			zonesList.add(o.getZoneType());
		});

		return zonesList;

	}

	@GetMapping("/all/{zoneId}")
	@ResponseBody
	public List<String> getDescriptionById(@PathVariable String zoneId) {

		List<String> descriptionDetails = new ArrayList<>();

		ZoneEntity zoneDetails;

		zoneDetails = zoneRepository.findByZoneType(zoneId);

		zoneDetails.getDescriptionTypeEntities().forEach(o -> {

			descriptionDetails.add(o.getDescType());
		});

		return descriptionDetails;

	}

	@PostMapping("/taxValue")
	@ResponseBody
	public double taxCalculation(@RequestBody RequestDto requestDto) {

		ZoneEntity zoneType = zoneRepository.findByZoneType(requestDto.getZoneId());
		DescriptionTypeEntity descType = descriptionRepository.findByDescTypeAndZoneZoneId(requestDto.getPropertyId(),
				zoneType.getZoneId());

		PropertyEntity property = propertyRepository.findByDescriptionTypeEntityDescIdAndStatus(descType.getDescId(),
				requestDto.getStatus());

		double t5;
		double area = Math.round(requestDto.getAreaId() * 100.0) / 100.0;
		double uav = property.getUav();
		double t1 = (float) (area * uav * 10);
		int year = Year.now().getValue();
		int depriciationValue = year - Integer.parseInt(requestDto.getYearId());

		if (depriciationValue < 60) {
			double t2 = t1 - (depriciationValue * t1) / 100;
			double t3 = t2 + (t2 * 20) / 100;
			double t4 = t3 + (t3 * 24) / 100;
			t5 = t3 + t4;
		} else {
			double t2 = t1 - (60 * t1) / 100;
			double t3 = t2 + (t2 * 20) / 100;
			double t4 = t3 + (t3 * 24) / 100;
			t5 = t3 + t4;
		}

		return Math.round(t5 * 100.0) / 100.0;

	}

	@PostMapping("/pay")
	@ResponseBody
	public String pay(@RequestBody RequestDto requestDto) {

		ZoneEntity zoneId = zoneRepository.findByZoneType(requestDto.getZoneId());

		if ("Owner".equalsIgnoreCase(requestDto.getStatus())) {

			zoneId.setOwnerAmount(zoneId.getOwnerAmount() + Math.round(requestDto.getTotalId() * 100.0) / 100.0);
			zoneRepository.save(zoneId);

		} else {
			zoneId.setTenantAmount(zoneId.getTenantAmount() + Math.round(requestDto.getTotalId() * 100.0) / 100.0);
			zoneRepository.save(zoneId);
		}

		return "Tax details are saved successfully";

	}

}
