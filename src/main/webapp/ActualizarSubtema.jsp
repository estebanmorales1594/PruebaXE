<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Actualizar Subtema</title>
		
		<!-- CSS -->
		<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
		
		
		<!-- JS -->
		<script type="text/javascript" src="js/jquery-1.5.1.min.js"></script>
		<script type="text/javascript" src="js/custom.js"></script>
		
		
		
		<!-- Nivo slider -->
		<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
		<script src="js/nivo-slider/jquery.nivo.slider.js" type="text/javascript"></script>
		<!-- ENDS Nivo slider -->
		
		<!-- tabs -->
		<link rel="stylesheet" href="css/tabs.css" type="text/css" media="screen" />
		<script type="text/javascript" src="js/tabs.js"></script>
  		<!-- ENDS tabs -->
  		
  		
		
		<!-- superfish -->
		<link rel="stylesheet" media="screen" href="css/superfish.css" /> 
		<link rel="stylesheet" media="screen" href="css/superfish-left.css" /> 
		<script type="text/javascript" src="js/superfish-1.4.8/js/hoverIntent.js"></script>
		<script type="text/javascript" src="js/superfish-1.4.8/js/superfish.js"></script>
		<script type="text/javascript" src="js/superfish-1.4.8/js/supersubs.js"></script>
		<!-- ENDS superfish -->
		
		<!-- poshytip -->
		<link rel="stylesheet" href="js/poshytip-1.0/src/tip-twitter/tip-twitter.css" type="text/css" />
		<link rel="stylesheet" href="js/poshytip-1.0/src/tip-yellowsimple/tip-yellowsimple.css" type="text/css" />
		<script type="text/javascript" src="js/poshytip-1.0/src/jquery.poshytip.min.js"></script>
		<!-- ENDS poshytip -->
		
		
		
		
		
	</head>
	
	<body class="home">
	
	
		<!-- WRAPPER -->
		<div id="wrapper">
			
			<!-- HEADER -->
			<div id="header">
				<a href="<%=request.getContextPath()%>/index.jsp"><img id="logo" src="img/ModuloAdministrativo.png" alt="Nova" /></a>
				<!-- Social -->
				<div id="social-holder">
					
				</div>
				<!-- ENDS Social -->
				
				<!-- Navigation -->
				<ul id="nav" class="sf-menu">
					
                    <li><a>Estudiante</a>
						<ul>
							<li><a href="<%=request.getContextPath()%>/RegistrarEstudiante.jsp"><span>Registrar Estudiante</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToMatricular"><span>Matricular Estudiante</span></a></li>
						</ul>
					</li>
					<li><a>Curso</a>
						<ul>
							<li><a href="<%=request.getContextPath()%>/RegistrarCurso.jsp"><span>Registrar Curso</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToCurso?x=ConsultarCurso"><span>Consultar Curso</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToCurso?x=ActualizarCurso"><span>Actualizar Curso</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToCurso?x=EliminarCurso"><span>Eliminar Curso</span></a></li>
						</ul>
					</li>
                    <li><a>Evaluacion</a>
						<ul>
			
							<li><a><span>Evaluacion</span></a>
                            	<ul>
                            		<li><a href="<%=request.getContextPath()%>/ToConfEvaluacion"><span>Configurar Evaluaci�n</span></a></li>
                                    <li><a href="<%=request.getContextPath()%>/ToEvaluacion?x=HabilitarEvaluacion"><span>Habilitar Evaluaci�n</span></a></li>
                            		<li><a href="<%=request.getContextPath()%>/ToEvaluacion?x=EstadoEvaluacion"><span>Ver Estado Evaluaci�n</span></a></li>
                            		<li><a href="<%=request.getContextPath()%>/ToEvaluacion?x=DetalleEvaluacion"><span>Ver Detalle Evaluaci�n</span></a></li>
                                </ul>
                            </li>
                            <li><a><span>Tipo de Evaluacion</span></a>
                            	<ul>
                            		<li><a href="<%=request.getContextPath()%>/RegistrarTipoEvaluacion.jsp"><span>Registrar Tipo de Evaluaci�n</span></a></li>
                            		<li><a href="<%=request.getContextPath()%>/ToTipoEvaluacion?x=ConsultarTipoEvaluacion"><span>Consultar Tipo Evaluaci�n</span></a></li>
									<li><a href="<%=request.getContextPath()%>/ToTipoEvaluacion?x=ActualizarTipoEvaluacion"><span>Actualizar Tipo Evaluaci�n</span></a></li>
									<li><a href="<%=request.getContextPath()%>/ToTipoEvaluacion?x=EliminarTipoEvaluacion"><span>Eliminar Tipo Evaluaci�n</span></a></li>
                                </ul>
                            </li>
							
						</ul>
					</li>
					
					<li><a>Pregunta</a>
						<ul>
							<li><a><span>Registrar Pregunta</span></a>
                            	<ul>
                                    <li><a href="<%=request.getContextPath()%>/postRegistrar"><span>Marcar con X</span></a></li>
                                    <li><a href="<%=request.getContextPath()%>/postRegistrarPC"><span>Completar Espacio en Blanco</span></a></li>
                                    <li><a href="<%=request.getContextPath()%>/postRegistrarD"><span>Desarrollo</span></a></li>
                                </ul>
                            </li>
                            <li><a><span>Tipo de Pregunta</span></a>
                            	<ul>
                            		<li><a href="<%=request.getContextPath()%>/RegistrarTipoPregunta.jsp"><span>Registrar Tipo Pregunta</span></a></li>
                                    <li><a href="<%=request.getContextPath()%>/ToTipoPregunta?x=ConsultarTipoPregunta"><span>Consultar Tipo Pregunta</span></a></li>
									<li><a href="<%=request.getContextPath()%>/ToTipoPregunta?x=ActualizarTipoPregunta"><span>Actualizar Tipo  Pregunta</span></a></li>
									<li><<a href="<%=request.getContextPath()%>/ToTipoPregunta?x=EliminarTipoPregunta"><span>Eliminar Tipo Pregunta</span></a></li>
                                </ul>
                            </li>
						</ul>
					</li>
					
					
					
					
                    <li><a>Tema</a>
						<ul>
							<li><a href="<%=request.getContextPath()%>/ToCurso?x=RegistrarTema"><span>Registrar Tema</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToTema?x=ConsultarTema"><span>Consultar Tema</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToTema?x=ActualizarTema"><span>Actualizar Tema</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToTema?x=EliminarTema"><span>Eliminar Tema</span></a></li>
						</ul>
					</li>
                    <li class="current-menu-item"><a>Subtema</a>
						<ul>
							<li><a href="<%=request.getContextPath()%>/ToCurso?x=RegistrarSubtema"><span>Registrar Subtema</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToSubtema?x=ConsultarSubtema"><span>Consultar Subtema</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToSubtema?x=ActualizarSubtema"><span>Actualizar Subtema</span></a></li>
							<li><a href="<%=request.getContextPath()%>/ToSubtema?x=EliminarSubtema"><span>Eliminar Subtema</span></a></li>
						</ul>
					</li>
					<li><a>Entrenamiento</a>
						<ul>
							<li><a href="<%=request.getContextPath()%>/SubirArchivos.jsp"><span>Subir Archivos Positivos</span></a></li>
						</ul>
					</li>
					<li><a href="<%=request.getContextPath()%>/AsignandoProfesor" > Asignar Profesor Curso</a></li>
				</ul>
				<!-- Navigation -->	
				
				
				
				
	
				
				<div id="slider-block">
				</div>
			
				
			</div>
		
			<div id="main">
			    <div>
			      <h2>Actualizar Subtema</h2>
			      <div>
			        <table>
                    
                    
                    <tr>
                    <form action="cargarDatosSubtema" method="post">
			            <td ><h3>Codigo del Subtema</h3></td>
			            <td ><!--input type="text" id="txtCodigo" name="txtCodigo" placeholder="Codigo Curso"  required/-->
			            <%@ page import="java.util.ArrayList, logicaDeNegocios.*" %>
			            <%
			            		ArrayList<Subtema> subtemas= (ArrayList<Subtema>) request.getAttribute("ListSubtemas"); 
			            		
						%>
			            
			            
			            <select id="selCodigo" name="selCodigo">
			            
			            <%  for(Subtema s:subtemas){ %>
			                <option value="<%=s.getCodSubTema() %>"><%= s.getDescripcion()%></option>
				        <% } %>
			            </select></td>
                        <td><button class="submit" type="submit" >Cargar Subtema</button></td>
                        </form>
		              </tr>
                      
                      <% try{
                      		String subtema = (String) request.getAttribute("Subtema");
                      	 %>
                      	<form name="actualizarSubtema" action="ActualizarSubtema?x=<%=subtema%>" method="post">
                       <tr>
                      	<% }catch(Exception e){
                      		System.out.println(e);%>
                      		<form name="actualizarSubtema" action="ActualizarSubtema" method="post">
                            <tr>
                      	<%}%>
                      
			            <td ><h3>Codigo del Tema</h3></td>
			            <td ><!--input type="text" id="txtCodigo2" name="txtCodigo" placeholder="Codigo Tema"  required/-->
			            <%
			            		ArrayList<Tema> temas= (ArrayList<Tema>) request.getAttribute("ListTemas"); 
			            		
						%>
			            <select id="selCodigoTema" name="selCodigoTema">
			            <%if(temas!=null){ %>
			            <%  for(Tema t:temas){ %>
			                <option value="<%=t.getCodTema() %>"><%= t.getDescripcionTema()%></option>
				        <% } %>
				        <% } %>
			            </select></td>
		              </tr>
			          
		              <tr>
			            <td ><h3>Descripcion del Subtema </h3></td>
			            <%
			            		String texto= (String) request.getAttribute("texto");
						%>
			            <td ><input type="text" id="txtDescripcion" name="txtDescripcion" placeholder="Descripcion"  value="<%= texto %>" required/>
			            
			            </td>
		              </tr>
		              
			       
			          <tr>
			            <td ></td>
			            <td  ><button class="submit" type="submit" >Actualizar Subtema</button></td>
		              </tr>
		              </form>
		            </table>
		          </div>
		        </div>
		  </div>
		<div id="footer">
		
		</div>
      </div>
</body>
	
</html>