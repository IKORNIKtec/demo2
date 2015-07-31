var basePage = require('../pages/basePage.js');

var GoeuroPage = function() {
    this.url = 'http://goeuro.com/';

    // Elements
    this.fromInput = element(by.id('from_filter'));
    this.toInput = element(by.id('to_filter'));
    this.searchButton = element(By.id('search-form__submit-btn'));

    // Methods
    this.search = function(from, to) {
        function sleep(milliseconds) {
            var start = new Date().getTime();
            for (var i = 0; i < 1e7; i++) {
                if ((new Date().getTime() - start) > milliseconds){
                    break;
                }
            }
        }

        console.log("Type from value as '%s'", from);
        this.fromInput.sendKeys(from);
        this.fromInput.sendKeys(protractor.Key.ENTER)

        console.log("Type to value as '%s'", to);
        this.toInput.sendKeys(to);

        this.toInput.sendKeys(protractor.Key.ENTER)

        console.log("Click 'Search' button");
        this.searchButton.click();

    };

};
GoeuroPage.prototype = basePage;
module.exports = new GoeuroPage();