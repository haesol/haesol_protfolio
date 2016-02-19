/*!
 * Article v1.0.0 (http://hellodeveloper.com)
 * Copyright Plane Earth Travelers.
 * Licensed under the MIT license
 */

url = "http://localhost:8080";

/*
 *  /ajax/article
 */
$(function() {
    var currentCategory = "모든 아티클",
        currentPage = 0;

    function moveCategory() {
        currentCategory = $(this).text();
        ajaxGetArticleByCategoryAndPage();
    };

    function goPreviousPage() {

        if (currentPage <= 0) {
            alert('first Page');
            currentPage = 0;
        } else {
            currentPage--;
        }

        ajaxGetArticleByCategoryAndPage();
    };
    
    function goNextPage() {
        currentPage++;
        ajaxGetArticleByCategoryAndPage();
    };

    function ajaxGetArticleByCategoryAndPage() {
        
        $.ajax({
            url : url + "/ajax/article",
            data : {
                CATEGORY_ID : currentCategory,
                PAGE_ID : currentPage
            },
            dataType : "json",
            success : function(data, textStatus) {
                
                if(data.result == 'SUCCESS') {
                    
                    // final page condition
                    if(currentPage != 0 && data.articles.length == 0) {
                        currentPage--;
                        alert('final Page');
                    } else {
                        clearArticleHtmlElement();
                        setHtmlElement(data.articles);
                    }
                    
                } else {
                    // need handling FAIL
                }

                // 아래의 hidden 데이터에 대한 처리 추가되어야함, jquery.data()를 사용할 것 같으나, JSP와의 연동을 고려해봐야함
                //{"articles":[{"userThumbnail":"안씀","id":5,"userId":3,"like":3},
            },
            error : function(textStatus) {
                // need handling err
            }
        });
    };
    
    function clearArticleHtmlElement() {
        
        for(var i = 1; i <= 4; i++) {
            
            $('#article' + i).hide();
            $('#article-title' + i).text('');
            $('#article-title' + i).attr("href", '');
            $('#article-username' + i).text('');
            $('#article-timestamp' + i).text('');
            $('#article-imghref' + i).attr("href", '');
            $('#article-img' + i).attr("src", '');
            $('#article-description' + i).text('');
            
        }
    };
    
    function setHtmlElement(articles) {
        
        for(var i = 1; i <= articles.length; i++){
            
            $('#article' + i).show();
            $('#article-title' + i).text(articles[i-1].title);
            $('#article-title' + i).attr("href", articles[i-1].uri);
            $('#article-username' + i).text(articles[i-1].userName);
            $('#article-timestamp' + i).append('<i class="fa fa-clock-o"></i> ' + articles[i-1].timestamp);
            $('#article-imghref' + i).attr("href", articles[i-1].uri);
            $('#article-img' + i).attr("src", articles[i-1].img);
            $('#article-description' + i).text(articles[i-1].description);
            
        }
    };
    
    $('#all-category').click(moveCategory);
    $('#devstory-category').click(moveCategory);
    $('#etc-category').click(moveCategory);
    $('#tipntech-category').click(moveCategory);
    $('#getstarted-category').click(moveCategory);
    
    $('#previous').click(goPreviousPage);
    $('#next').click(goNextPage);
});