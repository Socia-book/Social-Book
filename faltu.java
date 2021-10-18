onEvent("button1","click",function(){
  setScreen("screen2");
});
function allcode(){
  function randomletter(){
  var text = "" ;  
  text +=choice.charAt(randomNumber(0,73));
  return text ;
  var choice = "ABCDEFGHIJKLMNOPQRSTUVWYZabcdefghijklmnopqrstuvwyz0123456789!@#$%^&*+-/";
  }
var lengthpass = getText("text_input1");
var password ="";
for (var i=0; i<lengthpass; i ++){
  password += randomletter();
  }
  write (password);
setText("label_PASS",password);
return (allcode);
}
onEvent("button_GENERATE","click",function(){
  allcode();
});