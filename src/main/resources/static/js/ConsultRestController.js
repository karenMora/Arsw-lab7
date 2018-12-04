/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var RestControllerModule=(function(){
    var getInfo = function(accion,select,callback){
        axios.get('/informacion+'+accion+"/"+select).then(function(information){
            callback.onSucces(information.data);
            console.log(information);
            })
            .catch(function(error){
                callback.onFailed(error);
                console.log(error);
            });
    };
    return {
      getInfo: getInfo  
    };
})();
