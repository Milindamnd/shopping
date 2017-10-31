<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="../shared/flows-header.jsp"%>

<div class="container">
<div class="row">
<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Sign Up - Step 2</h4>
				</div>
<div class="panel-body">
						<sf:form id="billingForm" class="form-horizontal"
						method="POST" modelAttribute="billing">
						<div class="form-group">

							<label class="control-lable col-md-4" for="addressLineOne">Address
								One</label>
							<div class="col-md-8">
								<sf:input type="text" path="addressLineOne" id="addressLineOne"
									placeholder="Address" class="form-control" />
								<sf:errors path="addressLineOne" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="addressLineTwo">
								Address tow</label>
							<div class="col-md-8">
								<sf:input type="text" path="addressLineTwo" id="addressLineTwo"
									placeholder="Address" class="form-control" />
								<sf:errors path="addressLineTwo" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="city">
								City</label>
							<div class="col-md-8">
								<sf:input type="text" path="city" id="city"
									placeholder="City" class="form-control" />
								<sf:errors path="city" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="state">State</label>
							<div class="col-md-8">
								<sf:input type="text" path="state" id="state"
									placeholder="State" class="form-control" />

								<sf:errors path="state" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="country">Country</label>
							<div class="col-md-8">
								<sf:input type="text" path="country" id="country"
									placeholder="Country" class="form-control" />

								<sf:errors path="country" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="postalCode">Postal
								Code</label>
							<div class="col-md-8">
								<sf:input type="text" path="postalCode" id="postalCode"
									placeholder="Postal Code" class="form-control" />
								<sf:errors path="postalCode" cssClass="help-block" element="em" />
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<button type="submit" class="btn btn-primary" name="_eventId_personal" >
								Back <span class="glyphicon glyphicon-chevron-left "></span>
								</button>
								<button type="submit" class="btn btn-primary" name="_eventId_confirm" >
								Next <span class="glyphicon glyphicon-chevron-right "></span>
								</button>
							</div>
						</div>


					</sf:form>
					</div>
					</div>
					</div>
					</div>
</div>
<!-- /.container -->
<%@include file="../shared/flows-footer.jsp"%>
