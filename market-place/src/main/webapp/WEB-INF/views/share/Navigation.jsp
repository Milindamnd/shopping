<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="./home">Market Place</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item" id="home">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/home">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item" id="about">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/about">About Us</a>
            </li>
            <li class="nav-item" id="product">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/show/all/product">View Products</a>
            </li>
            <li class="nav-item" id="contact">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/contact">Contact Us</a>
            </li>
            <security:authorize access="hasAuthority('ADMIN')">
            <li class="nav-item" id="manageProduct">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/manage/products">Manage Products</a>
            </li>
            </security:authorize>
            <li class="nav-item" id="addCategory">
              <a class="nav-link" href="${pageContext.servletContext.contextPath}/manageCategory/category">Add Category</a>
            </li>
           
          </ul>
       
          <ul class="nav navbar-nav navbar-right">
           <security:authorize access="isAnonymous()">
          	<li id="register">
          		 <a href="${pageContext.servletContext.contextPath}/register">Sign Up</a>
          		 
          	</li>
          	<li id="login">
          		 <a href="${pageContext.servletContext.contextPath}/login">Login</a>
          	</li> 	
          	</security:authorize>
          	<security:authorize access="isAuthenticated()">
          	<li class="dropdown" id="mycart">
          	<a href="javascript:void(0)" class="btn btn-default dropdown-toggle" 
          	id="dropdownOne" data-toggle="dropdown">
          	${userCartModel.name}
          	</a>
          	<ul class="dropdown-menu">
          	<security:authorize access="hasAuthority('USER')">
          		<li>
          			<a href="${pageContext.servletContext.contextPath}/cart/show">
          				<span class="glyphicon glyphicon-shopping-cart"></span>
          				<span class="badge">${userCartModel.cart.cartLine}</span>-&#8377; ${userCartModel.cart.grandTotal}
          			</a>
          		</li>
          		<li class="divider" role="separator"></li>
          		</security:authorize>
          		<li>
          			<a href="${pageContext.servletContext.contextPath}/perform-logout">Logout</a>
          		</li>
          		
          </ul>
          </li>
          </security:authorize>
          </ul> 
        </div>
      </div>
    </nav>
    
    <script>
		window.userRole='${userCartModel.role}'
	</script>

 