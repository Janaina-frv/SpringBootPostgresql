package com.example.demo.approval;

import java.util.ArrayList;
import java.util.List;

public class AllProcessors {
	
	List<ApprovalManager> processors = new ArrayList<>();

	public AllProcessors(List<ApprovalManager> processors) {
		super();
		this.processors = processors;
		processors.add(new AgeProcessor());
		processors.add(new PatrimonioProcessor());
		processors.add(new ProfissaoProcessor());
	}

	
	

}
