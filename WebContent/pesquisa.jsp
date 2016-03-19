<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pesquisar Questões</title>

<link href="css/custom.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap-theme.min.css">

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/menu_superior.js"></script>

</head>
<body>

	<%@ include file = "menu_superior.html" %>
	
	<form>
		<div class="jumbotron">
			<div class="container">
				<div class="div_filtro">
					<label>Matéria e Assunto</label>
					<div class="panel-group" id="accordion">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseOne">Direito Constitucional</a>
								</h4>
							</div>
							<div id="collapseOne" class="panel-collapse collapse in">
								<div class="panel-body">
									<p>
										<input type="checkbox" /> Princípios Fundamentais
									</p>
									<p>
										<input type="checkbox" /> Direitos e Garantias Fundamentais
									</p>
									<p>
										<input type="checkbox" /> Organização do Estado
									</p>
									<p>
										<input type="checkbox" /> Organização dos Poderes
									</p>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseTwo">Direito Administrativo</a>
								</h4>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse">
								<div class="panel-body">
									<p>
										<input type="checkbox" /> Princípios da Administração
									</p>
									<p>
										<input type="checkbox" /> Administração Pública
									</p>
									<p>
										<input type="checkbox" /> Poderes da Administração
									</p>
									<p>
										<input type="checkbox" /> Agentes Públicos
									</p>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseThree">Gestão e Governança de TI</a>
								</h4>
							</div>
							<div id="collapseThree" class="panel-collapse collapse">
								<div class="panel-body">
									<p>
										<input type="checkbox" /> PMBOK
									</p>
									<p>
										<input type="checkbox" /> ITIL
									</p>
									<p>
										<input type="checkbox" /> COBIT
									</p>
								</div>
							</div>
						</div>




						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseOne">Direito Constitucional</a>
								</h4>
							</div>
							<div id="collapseOne" class="panel-collapse collapse">
								<div class="panel-body">
									<p>
										<input type="checkbox" /> Princípios Fundamentais
									</p>
									<p>
										<input type="checkbox" /> Direitos e Garantias Fundamentais
									</p>
									<p>
										<input type="checkbox" /> Organização do Estado
									</p>
									<p>
										<input type="checkbox" /> Organização dos Poderes
									</p>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseTwo">Direito Administrativo</a>
								</h4>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse">
								<div class="panel-body">
									<p>
										<input type="checkbox" /> Princípios da Administração
									</p>
									<p>
										<input type="checkbox" /> Administração Pública
									</p>
									<p>
										<input type="checkbox" /> Poderes da Administração
									</p>
									<p>
										<input type="checkbox" /> Agentes Públicos
									</p>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseThree">Gestão e Governança de TI</a>
								</h4>
							</div>
							<div id="collapseThree" class="panel-collapse collapse">
								<div class="panel-body">
									<p>
										<input type="checkbox" /> PMBOK
									</p>
									<p>
										<input type="checkbox" /> ITIL
									</p>
									<p>
										<input type="checkbox" /> COBIT
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="div_form_pesquisa ">

					<div class="form-group">
						<label for="inputQtdQuestoes">Quantidade de questões</label> <input
							type="text" class="form-control" style="width: 100px;"
							id="inputQtdQuestoes">
					</div>
					<div class="form-group">
						<label for="selectTipoQuestao">Tipo de Questão</label> <select
							name="tipoQuestao" class="form-control" id="selectTipoQuestao">
							<option value="cespe">Certo ou errado</option>
							<option value="discursiva">Discursiva</option>
							<option value="multipla">Múltipla Escolha</option>
						</select>
					</div>
					<div class="form-group">
						<label for="selectBanca">Banca</label> <select name="banca"
							class="form-control" id="selectBanca">
							<option value="cespe">CESPE</option>
							<option value="esaf">ESAF</option>
							<option value="fcc">FCC</option>
						</select>
					</div>
					<div class="form-group">
						<label for="selectOrgao">Prova</label> <select
							name="orgao" class="form-control" id="selectOrgao">
							<option value="cespe">ANAC</option>
							<option value="esaf">MPGO</option>
							<option value="fcc">BACEN</option>
						</select>
					</div>
					<div class="form-group">
						<label>Ano</label>
						<div class="form-inline">
							<label for="selectAnoDe">De</label> <select name="anoDe"
								class="form-control" id="selectAnoDe">
								<option value="cespe">2016</option>
								<option value="discursiva">2015</option>
								<option value="multipla">2014</option>
								<option value="multipla">2013</option>
								<option value="multipla">2012</option>
								<option value="multipla">2011</option>
							</select> <label for="selectAnoAte">Até</label> <select name="anoAte"
								class="form-control" id="selectAnoAte">
								<option value="cespe">2016</option>
								<option value="discursiva">2015</option>
								<option value="multipla">2014</option>
								<option value="multipla">2013</option>
								<option value="multipla">2012</option>
								<option value="multipla">2011</option>
							</select>
						</div>
					</div>
				</div>
			</div>

		</div>

		<div class="container">
			<button type="submit" class="btn btn-primary btnPesquisar">Pesquisar</button>
			<button type="submit" class="btn btn-default btnLimpar">Limpar</button>
		</div>

	</form>
	
	
</body>
</html>