package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class GetSuitcaseDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String conversation = (String) delegateExecution.getVariable("lastTravel");

        if (conversation.equals("Europe")){
            delegateExecution.setVariable("haveSuitcase", true);
            System.out.println("Vincent and Jules get the suitcase. They survived a shooting. Back in the car they accidentally kill Marvin. They change clothes. Afterwards they have breakfast in a dinner");
        } else {
            delegateExecution.setVariable("haveSuitcase", false);
            System.out.println("Vincent and Jules could not get the suitcase and died while trying --> sorry not the right story ending");
        }
    }
}
