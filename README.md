# cordova-plugin-xtoast
Cordova plugin to create native toast in android.

### Supported Platform:
* Android

### Installations:
> cordova plugin add https://github.com/Anas74khan/cordova-plugin-xtoast

After installation, the xtoast plugin would be avilable in "window" object.

### Methods:
* Show toast.

```js

let successCallback = function(result){
    console.log(result);//"Toast displayed successfully."
}
let errorCallback = function(err){
    console.error(err)
}
let params = {
    message : "This is my message", //if not mentioned then error callback "No message specified!"
    duration : 2000 //optional duration in Millisecond
}
window["xtoast"].showToast(params,successCallback,errorCallback);


```


### Release Notes:
# 0.0.1:
 Initial Release