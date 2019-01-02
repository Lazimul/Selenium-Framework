package search;

import base.CommonApi;

public class SearchPage extends CommonApi {
public void searchMenu(){
    typeOnElementNEnter("#twotabsearchtextbox", "books");
    navigateBack();
    //clearField("#twotabsearchtextbox");
    typeOnElementNEnter("#twotabsearchtextbox", "laptop");
    navigateBack();
    //clearField("#twotabsearchtextbox");
    typeOnElementNEnter("#twotabsearchtextbox", "ball");
}
}
