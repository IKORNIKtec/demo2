var basePage = require('../pages/basePage.js');

var GoeuroResultsPage = function() {
    // pages elements...
    this.main = element(by.id('searchoptions'));

    this.resultItems = function(trainProvider) {
            console.log("Train provider is '%s'", trainProvider);
            return element.all(by.css("#results-train [alt='"+trainProvider+"']"));
    };

};
GoeuroResultsPage.prototype = basePage;
module.exports = new GoeuroResultsPage();
