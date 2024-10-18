package browserHistoryStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    // declare 2 variable of stack
    Deque<String> historyStack;
    Deque<String> forwardStack;
    String currentPage;


    public BrowserHistory(String homepage){
        // Initialize stacks and set current url to Homepage
        historyStack= new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage =homepage;
    }
    public void visit(String url){
        historyStack.push(currentPage);
        System.out.println(url + " is visited");
        currentPage = url;
        forwardStack = new ArrayDeque<>();

    }
    public String back(int steps){
        int stepNumber = steps;
        while (steps>0 && !historyStack.isEmpty()){
            forwardStack.push(currentPage);
            currentPage= historyStack.pop();
            steps--;
        }
        System.out.println("Back operation of " + stepNumber + " brings " + currentPage + " as current page");
        return currentPage;

    }
    public String forward(int steps){
        int stepNumber = steps;
        while(steps >0 && !forwardStack.isEmpty()){
            historyStack.push(currentPage);
            currentPage = forwardStack.pop();
            steps--;
        }
        System.out.println("Forward operation of " + stepNumber + " brings " + currentPage + "as current page");

        return currentPage;
    }

}
