package com.example.demo.approval;

public class ApplicationException extends RuntimeException{
	private ProcessorException processorException;

	public ApplicationException(com.example.demo.approval.ProcessorException processorException) {
		super();
		this.processorException = processorException;
	}
	
	public ApplicationException() {
	}

	public ProcessorException getProcessorException() {
		return processorException;
	}

	public void setProcessorException(ProcessorException processorException) {
		this.processorException = processorException;
	}
	
	

}
