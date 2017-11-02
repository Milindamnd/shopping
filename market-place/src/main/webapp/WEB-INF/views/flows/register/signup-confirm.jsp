<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@include file="../shared/flows-header.jsp"%>

<div class="row">
	<!-- presonl details -->
	<div class="col-sm-6">

		<div class="panel panel-primary">
			<div class="panel-heading">
				<h4>Presonal Details</h4>
			</div>
			<div class="panel-body">
				<div class="text-center">
				<h4>${registerModel.userDetail.fName} ${registerModel.userDetail.lName}</h4>
				<h5>Email ${registerModel.userDetail.email}</h5>
				<h5>Role  ${registerModel.userDetail.role}</h5>
				<h5>Contact ${registerModel.userDetail.contactNumber}</h5>
				
				</div>
			</div>
			<div class="panel-footer">
				<a href="${flowExecutionUrl}&_eventId_personal"
					class="btn btn-primary">Edit</a>
			</div>
</div>

		</div>

		<!-- Address details -->
		<div class="col-sm-6">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h4>Address Details</h4>
			</div>
			<div class="panel-body">
				<div class="text-center">
					<h5>${registerModel.address.addressLineOne} ${registerModel.address.addressLineTwo}</h5>
					<h5>City ${registerModel.address.city}</h5>
					<h5>State ${registerModel.address.state}</h5>
					<h5>Country ${registerModel.address.country}</h5>
					<h5>Postal ${registerModel.address.postalCode}</h5>
				</div>
			</div>
			<div class="panel-footer">
				<a href="${flowExecutionUrl}&_eventId_billing"
					class="btn btn-primary">Edit</a>
			</div>

</div>
		</div>
		</div>
<div class="row">
	<div class="col-sm-4 col-sm-offset-4">
		<div class="text-center">
			<a href="${flowExecutionUrl}&_eventId_submit"
				class="btn btn-primary">Confirm</a>
		</div>

	</div>


</div>


<%@include file="../shared/flows-footer.jsp"%>


