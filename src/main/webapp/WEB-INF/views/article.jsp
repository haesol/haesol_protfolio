<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Hello Developer</title>

<!-- Bootstrap Core CSS -->
<link href="/resources/css/bootstrap.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="/resources/css/modern-business.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<!-- Custom Fonts -->
<link href="/resources/css/hellodeveloper.css" rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- favicon -->
<link rel="apple-touch-icon" sizes="57x57" href="resources/favicon/apple-touch-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60" href="resources/favicon/apple-touch-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72" href="resources/favicon/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76" href="resources/favicon/apple-touch-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114" href="resources/favicon/apple-touch-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120" href="resources/favicon/apple-touch-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144" href="resources/favicon/apple-touch-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152" href="resources/favicon/apple-touch-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180" href="resources/favicon/apple-touch-icon-180x180.png">
<link rel="icon" type="image/png" href="resources/favicon/favicon-32x32.png" sizes="32x32">
<link rel="icon" type="image/png" href="resources/favicon/android-chrome-192x192.png" sizes="192x192">
<link rel="icon" type="image/png" href="resources/favicon/favicon-96x96.png" sizes="96x96">
<link rel="icon" type="image/png" href="resources/favicon/favicon-16x16.png" sizes="16x16">
<link rel="manifest" href="resources/favicon/manifest.json">
<link rel="mask-icon" href="resources/favicon/safari-pinned-tab.svg" color="#5bbad5">
<meta name="msapplication-TileColor" content="#2b5797">
<meta name="msapplication-TileImage" content="resources/favicon/mstile-144x144.png">
<meta name="theme-color" content="#ffffff">

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span
                        class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/">HelloDeveloper;</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/about">About</a></li>
                    <li><a href="/article">Article</a></li>
                    <li><a href="/query">Query</a></li>
                    <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><img
                            src="/resources/img/no_profile_img.png" class="navi-profile"></img></a>
                        <ul class="dropdown-menu">
                            <li><a href="/profile">Profile</a></li>
                            <li><a href="/myArticle">Article</a></li>
                            <li><a href="/myQuery">Query</a></li>
                            <li><a href="/logout">Logout</a></li>
                        </ul></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    모든 아티클 <small></small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="/article">Home</a></li>
                    <li class="active">모든 아티클</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <div class="row">

            <!-- Blog Entries Column -->
            <div class="col-md-8">

                <!-- First Blog Post -->
                <h2>
                    <a href=${firstArticleUrl } target="_blank">${firstArticleTitle}</a>
                </h2>
                <p class="lead">
                    by <a href="index.php">${firstArticleAuthor}</a>
                </p>
                <p>
                    <i class="fa fa-clock-o"></i> ${firstArticleTimestamp}
                </p>
                <hr>
                <a href=${firstArticleUrl } target="_blank"> <img class="img-responsive img-hover" src=${firstArticleImg }
                    alt="">
                </a>
                <hr>
                <p>${firstArticleDescription}</p>
                <a class="btn btn-primary" href="#">Read More <i class="fa fa-angle-right"></i></a>

                <hr>

                <!-- Second Blog Post -->
                <h2>
                    <a href=${secondArticleUrl } target="_blank">${secondArticleTitle}</a>
                </h2>
                <p class="lead">
                    by <a href="index.php">${secondArticleAuthor}</a>
                </p>
                <p>
                    <i class="fa fa-clock-o"></i> ${secondArticleTimestamp}
                </p>
                <hr>
                <a href=${secondArticleUrl } target="_blank"> <img class="img-responsive img-hover" src=${secondArticleImg }
                    alt="">
                </a>
                <hr>
                <p>${secondArticleDescription}</p>
                <a class="btn btn-primary" href="#">Read More <i class="fa fa-angle-right"></i></a>

                <hr>

                <!-- Third Blog Post -->
                <h2>
                    <a href=${thirdArticleUrl } target="_blank">${thirdArticleTitle}</a>
                </h2>
                <p class="lead">
                    by <a href="index.php">${thirdArticleAuthor}</a>
                </p>
                <p>
                    <i class="fa fa-clock-o"></i> ${thirdArticleTimestamp}
                </p>
                <hr>
                <a href=${thirdArticleUrl } target="_blank"> <img class="img-responsive img-hover" src=${thirdArticleImg }
                    alt="">
                </a>
                <hr>
                <p>${thirdArticleDescription}</p>
                <a class="btn btn-primary" href="#">Read More <i class="fa fa-angle-right"></i></a>

                <hr>

                <!-- Pager -->
                <ul class="pager">
                    <li class="previous"><a href="#">&larr; Older</a></li>
                    <li class="next"><a href="#">Newer &rarr;</a></li>
                </ul>

            </div>

            <!-- Blog Sidebar Widgets Column -->
            <div class="col-md-4">

                <!-- Blog Search Well -->
                <div class="well">
                    <h4>Blog Search</h4>
                    <div class="input-group">
                        <input type="text" class="form-control"> <span class="input-group-btn">
                            <button class="btn btn-default" type="button">
                                <i class="fa fa-search"></i>
                            </button>
                        </span>
                    </div>
                    <!-- /.input-group -->
                </div>

                <!-- Blog Categories Well -->
                <div class="well">
                    <h4>Blog Categories</h4>
                    <div class="row">
                        <div class="col-lg-6">
                            <ul class="list-unstyled">
                                <li><a href="#">Category Name</a></li>
                                <li><a href="#">Category Name</a></li>
                                <li><a href="#">Category Name</a></li>
                                <li><a href="#">Category Name</a></li>
                            </ul>
                        </div>
                        <!-- /.col-lg-6 -->
                        <div class="col-lg-6">
                            <ul class="list-unstyled">
                                <li><a href="#">Category Name</a></li>
                                <li><a href="#">Category Name</a></li>
                                <li><a href="#">Category Name</a></li>
                                <li><a href="#">Category Name</a></li>
                            </ul>
                        </div>
                        <!-- /.col-lg-6 -->
                    </div>
                    <!-- /.row -->
                </div>

                <!-- Side Widget Well -->
                <div class="well">
                    <h4>Info</h4>
                    <p>원하는 카테고리에 자유롭게 아티클을 업로드할 수 있습니다. 현재는 외부 글로의 이동만 가능하며, 자체적인 글쓰기 기능은 추후 개발될 예정입니다 :)</p>
                </div>

            </div>

        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Planet Earth Traveller</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="/resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="/resources/js/bootstrap.min.js"></script>

</body>

</html>
