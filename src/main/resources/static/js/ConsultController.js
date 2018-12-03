/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var RestControllerModule=(function(){
    var getInfo = function(){
        axios.get().then(function(information){
            callback.onSucces(information.data);
            console.log(information);
        })
    };
    return {
      getInfo: getInfo  
    };
})();
