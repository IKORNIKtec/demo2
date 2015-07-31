/**
 * Created by koroli on 31.07.2015.
 */
var CommonUtils = function() {
    this.sleep = function(milliseconds) {
        var start = new Date().getTime();
        for (var i = 0; i < 1e7; i++) {
            if ((new Date().getTime() - start) > milliseconds){
                break;
            }
        }
    };
};

module.exports = new CommonUtils();