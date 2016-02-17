package com.devTeam.versiona.utils;

public enum ArticleCategory {

    // need to sync database ENUM category.
    ALL("모든 아티클"), GETSTARTED("Get Started"), DEVSTORY("개발자 이야기"), TIPNTECH("팁&테크"), ETC("기타");

    private String name;

    private ArticleCategory(String categoryName) {

        this.name = categoryName;

    }
    
    public String getName() {
        
        return this.name;
        
    }

}
