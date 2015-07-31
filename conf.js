var HtmlReporter = require('protractor-html-screenshot-reporter');

exports.config = {
    seleniumServerJar: "node_modules/selenium-server-standalone-jar/jar/selenium-server-standalone-2.45.0.jar",
    specs:['specs/searchGoeuroSpec.js'],

    baseUrl: 'http://goeuro.com/',
    framework: 'jasmine2',

    onPrepare: function(){
        // set implicit wait times in ms...
        browser.manage().timeouts().implicitlyWait(20000);

        // better jasmine 2 reports...
        // also requires print: function() {} in jasmineNodeOpts section
        var SpecReporter = require('jasmine-spec-reporter');
        jasmine.getEnv().addReporter(new SpecReporter({displayStacktrace: true}));
    },

    capabilities: {
		browserName: 'firefox'
	},

    /*
    multiCapabilities: [{
        'browserName': 'chrome'
    }, {
        'browserName': 'firefox'
    }],
*/
	jasmineNodeOpts: {
		isVerbose: true,
		includeStackTrace: true,
		showColors: true,
		defaultTimeoutInterval: 30000,
        print: function() {}
	}
};
