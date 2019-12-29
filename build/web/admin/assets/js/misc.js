function setCookie(name, value, hours) {
   var exdate = new Date();
   var endH = exdate.getHours() + hours;
   exdate.setHours(hours);
   document.cookie = name + "=" + escape(value) + ((hours == null) ? "" : ";expires=" + exdate.toGMTString() + "; path=/;");
}
function getCookie(name) {
   var start = document.cookie;
   var start = start.split("; ");
   for (var key in start) {
      var check = start[key].split('=');
      if (check[0] == name) {
         return unescape(check[1]);
      }
   }
}
function __get() {
   obj = {}
   GET = location.search;
   GET = GET.split('?');
   GET = GET[1]
   if (GET != undefined) {
      GET = GET.split('&amp;');
      for (i in GET) {
         get = GET[i].split('=');
         obj[get[0]] = get[1];
      }
   }
   return obj;
}