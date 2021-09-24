var showToast = function (data,sCallback, fCallback) {
    cordova.exec(sCallback, fCallback, "xtoast", "showToast", [data]);
}
module.exports = { showToast};