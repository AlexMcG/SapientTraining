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
	<script src="js/login.js"></script>
	<link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
	<link rel="icon" type="image/x-icon" href="favicon.ico" />
<script type="text/javascript" src="http://platform.linkedin.com/in.js">
  api_key:77a3gl1p3tvgf0
  onLoad: OnLinkedInFrameworkLoad
  authorize:true
</script>
<script type="text/javascript" src="js/facebookAuth.js"></script>
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
												<li class="active"><a href="#tab1default" id="login-form-link" data-toggle="tab">LinkedIn</a></li>
												<li><a href="#tab2default" id="register-form-link" data-toggle="tab">Facebook</a></li>
											</ul>
										</div>
										<div class="panel-body">
											<div class="tab-content">
												<div class="col-lg-12 tab-pane fade in active"
													id="tab1default">
													<form id="linked-in"
														action="" method="post"
														role="form" style="display: block;">
														<div class="form-group">
															<input type="text" name="fname" id="fname" tabindex="1"
																class="form-control" placeholder="First Name"
																value="" required>
														</div>
														<div class="form-group">
															<input type="text" name="lname" id="lname"
																tabindex="2" class="form-control" placeholder="Last Name" required>
														</div>
														<div class="form-group">
															<input type="text" name="pictureurl" id="pictureurl" tabindex="6"
																class="form-control" placeholder="Picture URL" value=""
																required>
														</div>
														<div class="form-group">
															<div class="row">
																<div class="col-sm-6 col-sm-offset-3">
																	<button name="register-submit"
																		id="register-submit" tabindex="7"
																		class="form-control btn btn-register"
																		>Update</button>
																	<div class="form-group">

																	</div>
																</div>
															</div>
														</div>
													</form>
													<script type="in/Login"></script>
												</div>
												<div class="col-lg-12 tab-pane fade" id="tab2default">
													<form id="register-form" action="register" method="post"
														role="form" style="display: none;">
														<div class="form-group">
															<input type="text" name="fname" id="fbfname" tabindex="1"
																class="form-control" placeholder="First Name" value=""
																required>
														</div>
														<div class="form-group">
															<input type="text" name="lname" id="fblname" tabindex="2"
																class="form-control" placeholder="Last Name" required>
														</div>
														<div class="form-group">
															<input type="text" name="pictureurl" id="fbpictureurl"
																tabindex="6" class="form-control"
																placeholder="Picture URL" value="" required>
														</div>
														<div class="form-group">
															<div class="row">
																<div class="col-sm-6 col-sm-offset-3">
																	<button name="register-submit"
																		id="register-submit" tabindex="7"
																		class="form-control btn btn-register"
																		>Update</button>
																</div>
															</div>
														</div>
													</form>
													<div id="facebookLogin">
														<fb:login-button scope="public_profile,email" onlogin="checkLoginState();"></fb:login-button>
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
	</div>
	<!-- /.intro-header -->

    <!-- Footer -->
    <%@ include file="footer.jsp" %>


	<!-- My javascript -->
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
	<script src="js/match.js"></script>
	<script type="text/javascript">
function OnLinkedInFrameworkLoad() {
    IN.Event.on(IN, "auth", OnLinkedInAuth);
  }
  
function OnLinkedInAuth() {
  IN.API.Profile("me").result(ShowProfileData);
}

function ShowProfileData(profiles) {
  var member = profiles.values[0];
  var id=member.id;
  var firstName=member.firstName; 
  var lastName=member.lastName; 
  var photo=member.pictureUrl; 
  var headline=member.headline; 

  document.getElementById("fname").value = firstName;
  document.getElementById("lname").value = lastName;
  document.getElementById("pictureurl").value = photo;
}
</script>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
