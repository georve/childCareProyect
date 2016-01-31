<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <div class="sidebar" data-color="blue" data-image="resources/assets/img/sidebar-5.jpg">    
    
    <!--   
        
        Tip 1: you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple" 
        Tip 2: you can also add an image using data-image tag
        
    -->
    
    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="#" class="simple-text">
                    BabyCare
                </a>
            </div>
		<!-- <div class="user">
			<div class="photo">
				<img src="${url}/resources/assets/img/default-avatar.png">
			</div>
			<div class="info">
				<a class="collapsed" href="#collapseExample" data-toggle="collapse">
					Tania Andrew <b class="caret"></b>
				</a>
				<div id="collapseExample" class="collapse">
					<ul class="nav">
						<li><a href="#">My Profile</a></li>
						<li><a href="#">Edit Profile</a></li>
						<li><a href="#">Settings</a></li>
					</ul>
				</div>
			</div>
		</div>-->

		<ul class="nav">
                <li class="active">
                    <a href="dashboard.html">
                        <i class="pe-7s-graph"></i> 
                        <p>Dashboard</p>
                    </a>            
                </li>
			    <li>
			    <a href="#registerItems" data-toggle="collapse" class=""
				aria-expanded="false"> 
				  <i class="pe-7s-id"></i>
					<p>
						Register <b class="caret"></b>
					</p>
			    </a>
				<div id="registerItems" class="collapse in" aria-expanded="true"
					style="">
					<ul class="nav">
						<li><a href="components/buttons.html">Personal
								Information</a></li>
						<li><a href="components/grid.html">Children</a></li>
						<li><a href="components/icons.html">Medications</a></li>
						<li><a href="components/notifications.html">Emergency
								Contact</a></li>
						<li><a href="components/panels.html">Activities
								Permission</a></li>
						<li><a href="components/sweet-alert.html">Information
								Aditional</a></li>

					</ul>
				</div>
			</li>
						    <li>
			    <a href="#Consult" data-toggle="collapse" class=""
				aria-expanded="false"> 
				  <i class="pe-7s-server"></i>
					<p>
						Consult <b class="caret"></b>
					</p>
			    </a>
				<div id="Consult" class="collapse in" aria-expanded="true"
					style="">
					<ul class="nav">
						<li><a href="components/buttons.html">Record</a></li>
						<li><a href="components/grid.html">Billinds</a></li>
						<li><a href="components/icons.html">Activities</a></li>
					</ul>
				</div>
			</li>

            </ul> 
    	</div>
    </div>