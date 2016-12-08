<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/bpp.css' />" rel="stylesheet"></link>

</head>
<body background=" ">
	<div class="wrapper">
		<h1>School Management Systems</h1>
		<p class="p">
			by Drona360 <a href="<c:url value='/home' />">Login</a>
		</p>
		<div class="row-2 clearfix">
			<div class="col-1-2">
				<h2>Institute Management</h2>
				<p class="p">If you are running multiple educational institutes
					like schools, colleges, universities, training centers etc and want
					to maintain separate books of accounts for each institute/school in
					a single database then this feature will be the most suitable for
					your requirement. Using multiple institutes, you can maintain your
					businesses with multiple accounting books. Not only this, you can
					also create logins for your employees and give the access for
					certain institute(s).</p>
				<p class="p">Transactions like Receive fee, received item entry,
					receive payment, pay supplier etc made in one institute will not be
					shown in other institutes. However as an admin if you login with
					multiple institutes, you can see all the transactions of all the
					institutes. At any point of time you can view your accounting
					ledgers, fees collected, salaries paid and expenses of a single
					institute as well as all the institutes.</p>
			</div>
			<div class="col-1-2">
				<h2>Course Management</h2>
				<p class="p">This feature allows you to define various courses
					that you offer in your Universities/Colleges/Schools. While
					defining the course you can also define course type (Year
					/Semester) and their duration. At the time of admission, you can
					easily enroll the student to the selected course. Drona360 software
					allows you to define class wise subjects as per the rules and
					regulations (Curriculum) of the respective University boards/School
					boards. You can also manage class wise list of compulsory and
					optional subjects.</p>
			</div>
		</div>
		<div class="row-4 clearfix">
			<div class="col-1-4">
				<h2>Student Management</h2>
				<p class="p">Drona360 - Student Management Systems allows you to
					capture all details of student such as name, academic details,
					contact information of the students and parents or guardians. In
					addition to personnel data, you can also store information about
					student's previous qualification/achievements, scholarship details,
					and other interests. Drona360 -student management allows you to
					attach external documents such as study certificate, Transfer
					certificates etc.</p>
				<p class="p">Each student will be assigned with a unique roll
					number and registration number at the time of student creation or
					you can assign your own roll number and registration number. In
					addition you can also create your additional fields to store any
					additional details of student like last school attended, reason for
					leaving, etc.</p>
				<p class="p">When you view a student details in Drona360 you
					will find all information related to the student such as student's
					personnel and academic details, fee structure applied, pending fee
					details, exam results. Drona360 also allows you to adjust student's
					pending fee details and fee due dates of each fee type as per your
					negotiations with student/parents.</p>
			</div>
			<div class="col-1-4">
				<h2>Fee Management</h2>
				<p class="p">Fee Management is one of the core components in
					managing Educational institutes, Coaching/Training centers.
					Drona360 allows great many numbers of features when it comes to fee
					management.</p>
			</div>
			<div class="col-1-4">
				<h2>Purchase & Supplier Management</h2>
				<p class="p">Drona360 has a lot of interesting features to offer
					when it comes to Purchase and Supplier management.Here's how you
					can manage your purchase and supplier with the help of Drona360.</p>
			</div>
			<div class="col-1-4">
				<h2>Library Management</h2>
				<p class="p">HDSchool Library management module allows you to
					easily catalogue books and maintain records of issued, reissued and
					overdue books. This module allows you to create library items
					(Books, CD's/DVD's etc) with specified number of copies. You can
					configure books issue related rules such as maximum number of books
					can be issued to a member (student/teacher), maximum penalty
					outstanding to allow issuing a new library item and penalty rules
					for overdue books. You can also track the date of issue and return
					of specific library item.</p>
				<p class="p">In HDSchool you can print library item barcode
					stickers in customized formats. Further, barcode integration, an
					option available with this library management module, makes
					borrowing books easy and error free for everyone.</p>
			</div>
		</div>
	</div>
	<div class=" ">${greeting} </div>
</body>
</html>