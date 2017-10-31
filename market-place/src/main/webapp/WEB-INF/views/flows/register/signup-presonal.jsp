<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="../shared/flows-header.jsp"%>

<div class="container">
<div class="row">
<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Sign Up - Step 1</h4>
				</div>
<div class="panel-body">
						<sf:form id="registerForm" class="form-horizontal"
						method="POST" modelAttribute="user">
						<div class="form-group">

							<label class="control-lable col-md-4" for="fName">First
								Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="fName" id="fName"
									placeholder="First Name" class="form-control" />
								<sf:errors path="fName" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="lName">
								Last Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="lName" id="lName"
									placeholder="Last Name" class="form-control" />
								<sf:errors path="lName" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="email">
								Email Address</label>
							<div class="col-md-8">
								<sf:input type="text" path="email" id="email"
									placeholder="Email Address" class="form-control" />
								<sf:errors path="email" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="password">Password</label>
							<div class="col-md-8">
								<sf:input type="password" path="password" id="password"
									placeholder="Password" class="form-control" />

								<sf:errors path="password" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="confirmPassword">Confirm Password</label>
							<div class="col-md-8">
								<sf:input type="password" path="confirmPassword" id="password"
									placeholder="Re-Enter Password" class="form-control" />

								<sf:errors path="confirmPassword" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="contactNumber">Contact
								Number</label>
							<div class="col-md-8">
								<sf:input type="text" path="contactNumber" id="contactNumber"
									placeholder="Contact Number" class="form-control" />
								<sf:errors path="contactNumber" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">

							<label class="control-lable col-md-4" for="role">Role</label>
							<div class="col-md-8">
								<label class="radio-inline">
								<sf:radiobutton path="role" value="USER" checked="checked"/>User
								</label>
								<label class="radio-inline">
								<sf:radiobutton path="role" value="SUPPLIER"/>Supplier
								</label>
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<button type="submit" class="btn btn-primary" name="_eventId_billing" >
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
</div>
<!-- /.container -->
<%@include file="../shared/flows-footer.jsp"%>
