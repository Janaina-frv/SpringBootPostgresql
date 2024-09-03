package com.example.demo.approval;

public class ApplicationException extends RuntimeException{
	private processorException processorException;

	public ApplicationException(com.example.demo.approval.processorException processorException) {
		super();
		this.processorException = processorException;
	}
	
	public ApplicationException() {
	}

	public processorException getProcessorException() {
		return processorException;
	}

	public void setProcessorException(processorException processorException) {
		this.processorException = processorException;
	}
	
	

}
