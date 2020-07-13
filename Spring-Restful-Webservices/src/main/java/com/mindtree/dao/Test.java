package com.mindtree.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Test {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		final String uri = "https://qa.mosip.io/v1/masterdata/registrationmachineusermappings";
// https://qa.mosip.io/v1/masterdata/registrationmachineusermappings

		ObjectNode requestMap = new ObjectMapper().readValue("{\"id\":\"REGISTRATION\",\"requesttime\":\"2020-02-11T04:48:54.171Z\",\"metadata\":{},\"request\":[{\"cntrId\":\"10003\",\"machineId\":\"10024\",\"langCode\":\"eng\",\"usrId\":\"110024\",\"isActive\":true}]}", ObjectNode.class);
//		Map<String, String> params = new HashMap<String, String>();
//
//		List<Map<String, Object>> list = new ArrayList<>();
//		Map<String, Object> requestMap = new LinkedHashMap<>();
//		requestMap.put("id", "REGISTRATION");
//		requestMap.put("requesttime", "2020-02-10T12:18:03.880Z");
//		requestMap.put("metadata", new HashMap<>());
//
//		Map<String, Object> userMap = new HashMap<>();
//		userMap.put("cntrId", "10003");
//		userMap.put("machineId", "10024");
//		userMap.put("isActive", true);
//		userMap.put("langCode", "eng");
//		userMap.put("usrId", "110024");
//		list.add(userMap);
//		requestMap.put("request", list);
		HttpHeaders status = new HttpHeaders();
		status.add("Cookie", "Authorization=eyJhbGciOiJSUzUxMiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJRakpYVzgtemMwR1RWRkQ0RnZiWkdTblZLSlhDMWRXVnBPVUxMLWVZT0JNIn0.eyJqdGkiOiI3MTdhYjZlZi0zZjgwLTQzNmQtYmFmOC1iMWE3YjcwZjkwNDkiLCJleHAiOjE1ODE0MDAyNDUsIm5iZiI6MCwiaWF0IjoxNTgxMzk3NTQ1LCJpc3MiOiJodHRwczovL21vc2lwa2V5Y2xvYWtxYS5zb3V0aGluZGlhLmNsb3VkYXBwLmF6dXJlLmNvbS9hdXRoL3JlYWxtcy9tb3NpcCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJhOTljYjQwYi02MmFkLTRkNjUtYjM1Zi03N2VmNTQ0YjEyNjgiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJyZWdpc3RyYXRpb24tY2xpZW50IiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiZWEyYjMzYjQtZjFlYS00ZDE5LWEwODctMTRjZWRhZjlmOTY1IiwiYWNyIjoiMSIsInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJSRUdJU1RSQVRJT05fQURNSU4iLCJSRUdJU1RSQVRJT05fT0ZGSUNFUiIsIlJFR0lTVFJBVElPTl9TVVBFUlZJU09SIiwiUkVHSVNUUkFUSU9OX09QRVJBVE9SIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJyZWdpc3RyYXRpb24tY2xpZW50Ijp7InJvbGVzIjpbInVtYV9wcm90ZWN0aW9uIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6InByb2ZpbGUgZW1haWwiLCJjbGllbnRIb3N0IjoiMTA0LjIxMS4yMDAuMTgxIiwiY2xpZW50SWQiOiJyZWdpc3RyYXRpb24tY2xpZW50IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJzZXJ2aWNlLWFjY291bnQtcmVnaXN0cmF0aW9uLWNsaWVudCIsImNsaWVudEFkZHJlc3MiOiIxMDQuMjExLjIwMC4xODEiLCJlbWFpbCI6InNlcnZpY2UtYWNjb3VudC1yZWdpc3RyYXRpb24tY2xpZW50QHBsYWNlaG9sZGVyLm9yZyJ9.b1HNgNZ-a4c6MRE5pE7f1Ep0TE-202EvYU72sZYAnjZNaVmQDatu_9UuduoRfSmDONfXUm81y3O2whFAzkniNhkngvvlVBxVtwJEfBrOoG7hgw7qtz7MO57OavKDTXHfqgACDg1GVMrsTps1hanhloYF7Vt5nLnTjJrRsRNftHbuuSFC05597LDQA-YqC5eiRWdVDqyswWrieh7bPggDF2rw-gqPuan6Ug2Ycj8UOD6oO5zrYDfNV59eaKWLBbWsQBc1lXXZ5xl5BINcf0SqfJ3MnfGu04yjE78QtahBQHcahVqAFRQAiHXTpUboPmCayp4VEhieYM00WdIJ04nKOQ");
		status.add("Content-Type", "application/json");
		HttpEntity<?> requestEntity = new HttpEntity<>(requestMap, status);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<?> res=restTemplate.exchange(uri, HttpMethod.PUT, requestEntity, Object.class);
		res.getBody();
		System.out.println();
	}
}
