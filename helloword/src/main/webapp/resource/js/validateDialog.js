/* Faz a validacao das Dialogs para que
 * quando elas estiverem com informacoes erradas
 * nao fechem, e sim facam o efeito Shake;
 */

function validaPais(xhr, status, args) {
	if (args.validationFailed || !args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmPais')).effect("shake", { times :
		 * 5 }, 100);
		 */
	} else {
		PF('ManterPais').hide();
	}
}

function validaEstado(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmEstado')).effect("shake", { times :
		 * 5 }, 100);
		 */
	} else {
		PF('ManterEstado').hide();
	}
}

function validaCidade(xhr, status, args) {
	return args.sucesso;
}

function validaCliente(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmCliente')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('dManterCliente').hide();
	}
}

function validaCondicao(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmCondicao')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterCondicao').hide();
	}
}

function validaCondicaoAlt(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmCondicaoAlt')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterCondicaoAlt').hide();
	}
}

function validaParcelaAlt(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmCondicaoAlt')).effect("shake", {
		 * times : 5 }, 100);
		 */
	}
}

function validaParcela(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmCondicao')).effect("shake", {
		 * times : 5 }, 100);
		 */
	}
}

function validaFormaAlt(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmFormaAlt')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterFormaAlt').hide();
	}
}

function validaForma(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmForma')).effect("shake", { times :
		 * 5 }, 100);
		 */
	} else {
		PF('ManterForma').hide();
	}
}

function validaTransporta(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmTransportadora')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterTransp').hide();
	}
}



function validaProduto(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmProduto')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('dManterProduto').hide();
	}
}

function validaFornecedor(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmFornecedor')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterFornecedor').hide();
	}
}

function validaFunc(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmFuncionario')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterFuncionario').hide();
	}
}

function validaCargo(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmCargo')).effect("shake", { times :
		 * 5 }, 100);
		 */
	} else {
		PF('ManterCargo').hide();
	}
}

function validaReceita(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmReceita')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterReceita').hide();
	}
}

function validaFinalVenda(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dFinalVenda')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('FinalVenda').hide();
		PF('ManterVenda').hide();
	}
}

function validaVenda(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmVenda')).effect("shake", { times :
		 * 5 }, 100);
		 */
	} else {
		PF('FinalVenda').show();
	}
}

function validaItemVenda(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmVenda')).effect("shake", { times :
		 * 5 }, 100);
		 */
	}
}

function validaCompra(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmCompra')).effect("shake", { times :
		 * 5 }, 100);
		 */
	} else {
		PF('FinalCompra').show();
	}
}

function validaFinalCompra(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dFinalCompra')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('FinalCompra').hide();
		PF('ManterCompra').hide();
	}
}

function validaContaPagar(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmContaPagar')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterContaPagar').hide();
	}
}

function validaPagarPagar(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dpContaPagar')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('PagarContaPagar').hide();
		PF('ViewContaPagar').hide();
	}
}

function validaPagarReceber(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dpContaReceber')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('PagarContaReceber').hide();
		PF('ViewContaReceber').hide();
	}
}

function validaProducao(xhr, status, args) {
	if (!args.sucesso) {
		/*
		 * $(PrimeFaces.escapeClientId('form:dmProducao')).effect("shake", {
		 * times : 5 }, 100);
		 */
	} else {
		PF('ManterProducao').hide();
	}
}
