<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
</head>
<body>
	<div>
		<h2>Assign Tasks</h2>
		<table>
			<tr>
				<td><label>Project*</label></td>
				<td style="padding-left: 30px"><select id="projectData">
						<option value="select">--select--</option>
				</select></td>
			</tr>
			<tr>
				<td><label>Description*</label></td>
				<td style="padding-left: 30px"><input type="text" /></td>
			</tr>
			<tr>
				<td><label>Start Date Of Task[dd-mm-yyyy]*</label></td>
				<td style="padding-left: 30px"><input type="text" /></td>
			</tr>
			<tr>
				<td><label>Due Date Of Task[dd-mm-yyyy]*</label></td>
				<td style="padding-left: 30px"><input type="text" /></td>
			</tr>
			<tr>
				<td><label>Who should do this?*</label></td>
				<td style="padding-left: 30px"><select id="employeeData" multiple>
				</select></td>
			</tr>
			<tr>
				<td><button>Add a Task</button></td>
				<td style="padding-left: 30px">
					<button>Cancel</button>
				</td>
			</tr>
		</table>
	</div>
</body>

<script type="text/javascript">
$(document).ready(function() {
	
	$.ajax({
        url: "/view",
        datatype: "JSON",
        type: "Get",
        success: function (data) {
            $.each(data, function (index, value) {
            	 $('#projectData').append('<option value="' + value.projectName + '">' + value.projectName + '</option>');
            });
        }
    });
	
	$.ajax({
        url: "/allEmployee",
        datatype: "JSON",
        type: "Get",
        success: function (data) {
            $.each(data, function (index, value) {
            	 $('#employeeData').append('<option value="' + value.empId + '">' + value.empId + " " + value.empName + '</option>');
            });
        }
    });

	
	/* $("#projectData").change(function() {
		$.ajax({
            type: "GET",
            url: '/project',
            contentType: "application/json; charset=utf-8",
            success: function(data) { alert('Success'); }

            });
	  }); */
	});

</script>
</html>
