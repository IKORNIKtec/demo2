browser.ignoreSynchronization = true;

var goeuroPage = require('../pages/goeuroHomePage');
var goeuroResults = require('../pages/goeuroResultsPage');
var searchData = require('..//data/searchData.js');

describe ('search Goeuro', function() {
    beforeEach(function() {
        goeuroPage.to();
        expect(goeuroPage.at());
    });

    it('Search Berlin - Hamburg should get DBahn (train) in results', function() {
        goeuroPage.search(searchData.search.to, searchData.search.from);
        expect(goeuroResults.resultItems(searchData.search.trainProvider).count()).toBeGreaterThan(0);
    });

});