package com.example.demo.approval;

public enum processorException {
	MENOR_IDADE{
		@Override
		public String getMessageError() {
			return "Cliente não é maior de idade!";
		}
	},
	DESEMPREGADO{
		@Override
		public String getMessageError() {
			return "Cliente está desempregado!";
		}
	},
	PATRIMONIO_LIMITE{
		@Override
		public String getMessageError() {
			return "Cliente não tem patrimônio maior que 10.000!";
		}
	};
	
	
	
	
	public abstract String getMessageError();

}
