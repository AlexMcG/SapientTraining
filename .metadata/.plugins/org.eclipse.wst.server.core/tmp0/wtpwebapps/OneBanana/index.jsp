<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>OneBanana.com</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/landing-page.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

	<!-- My stuff -->
	<link href="css/style.css" rel="stylesheet">
	<script src="js/jquery.js"></script>
	
	<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
	<link rel="icon" type="image/x-icon" href="favicon.ico" />
</head>

<body>

    <!-- Navigation -->
    <%@ include file="navigation.jsp" %>


    <!-- Header -->
    <a name="about"></a>
	<div class="intro-header">
		<div class="container">

			<div class="row">
				<div class="col-lg-12">
					<div class="intro-message">
						<h1>One Banana</h1>
						<h3>The social aggregation network</h3>
						<hr class="intro-divider">

						<div class="container">
							<div class="row">
								<div class="col-md-6 col-md-offset-3">
									<div class="panel with-nav-tabs panel-default">
										<div class="panel-heading">
											<ul class="nav nav-tabs">
												<li class="active"><a href="#tab1default" id="login-form-link" data-toggle="tab">Login</a></li>
												<li><a href="#tab2default" id="register-form-link" data-toggle="tab">Register</a></li>
											</ul>
										</div>
										<div class="panel-body">
											<div class="tab-content">
												<div class="col-lg-12 tab-pane fade in active"
													id="tab1default">
													<form id="login-form" action="process"
														method="post"
														role="form" style="display: block;">
														<div class="form-group">
															<input type="email" name="email" id="email"
																tabindex="1" class="form-control" placeholder="Email"
																value="" required>
														</div>
														<div class="form-group">
															<input type="password" name="password" id="password"
																tabindex="2" class="form-control" placeholder="Password" required>
														</div>
														<div class="form-group text-center" style="display: none">
															<input type="checkbox" tabindex="3" class=""
																name="remember" id="remember"> <label
																for="remember"> Remember Me</label>
														</div>
														<div class="form-group">
															<div class="row">
																<div class="col-sm-6 col-sm-offset-3">
																	<input type="submit" name="login-submit"
																		id="login-submit" tabindex="4"
																		class="form-control btn btn-login" value="Log In">
																</div>
															</div>
														</div>
													</form>
												</div>
												<div class="col-lg-12 tab-pane fade" id="tab2default">
													<form id="register-form"
														action="register" method="post"
														role="form" style="display: none;">
														<div class="form-group">
															<input type="email" name="email" id="email" tabindex="1"
																class="form-control" placeholder="Email Address"
																value="" required>
														</div>
														<div class="form-group">
															<input type="password" name="password" id="rPassword"
																tabindex="2" class="form-control" placeholder="Password" required>
														</div>
														<div class="form-group">
															<input type="password" name="confirm-password"
																id="confirm-password" tabindex="3" class="form-control"
																placeholder="Confirm Password" onblur="match()" required>
														</div>
														<div class="form-group">
															<input type="text" name="firstName" id="firstName"
																tabindex="4" class="form-control"
																placeholder="First Name" value="" required>
														</div>
														<div class="form-group">
															<input type="text" name="lastName" id="lastName"
																tabindex="5" class="form-control"
																placeholder="Last Name" value="" required>
														</div>
														<div class="form-group">
															<input type="tel" name="phoneNumber" id="phoneNumber" tabindex="6"
																class="form-control" placeholder="Phone Number" value=""
																required>
														</div>
														<div class="form-group">
															<div class="row">
																<div class="col-sm-6 col-sm-offset-3">
																	<input type="submit" name="register-submit"
																		id="register-submit" tabindex="7"
																		class="form-control btn btn-register"
																		value="Register Now">
																</div>
															</div>
														</div>
													</form>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					
					</div>
				</div>
			</div>
			
		</div>
	</div>
	<!-- /.intro-header -->

    <!-- Page Content -->

	<a  name="services"></a>
    <div class="content-section-a">

        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">Update all of your social networks from one place</h2>
                    <p class="lead">OneBanana.com is a central hub from which you can control all your social networks. Update all your information across services with the click of a button!</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/banana-computer.jpg" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

    <div class="content-section-a">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">Fast and Secure</h2>
                    <p class="lead">OneBanana.com uses only the latest technologies to ensure that you and your data are safe from prying eyes. 
                    Our systems have been optimized to provide the quickest access to social content.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/banana-grabber.png" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

	<a  name="contact"></a>
    <div class="banner">

        <div class="container">

            <div class="row">
                <div class="col-lg-6">
                    <h2>Connect to OneBanana.com:</h2>
                </div>
                <div class="col-lg-6">
                    <ul class="list-inline banner-social-buttons">
                        <li>
                            <a href="https://twitter.com/onebananas" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                        </li>
                        <li>
                            <a href="https://github.com/AlexMcG/OneBanana.com" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                        </li>
                        <li>
                            <a href="https://www.facebook.com/ONEBananas" class="btn btn-default btn-lg"><i class="fa fa-facebook fa-fw"></i> <span class="network-name">Facebook</span></a>
                        </li>
                    </ul>
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.banner -->

    <!-- Footer -->
    <%@ include file="footer.jsp" %>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- My javascript -->
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
	<script src="js/match.js"></script>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    
    <script src="js/login.js"></script>
    

</body>

</html>
