var dog ={
    raining :true,
    noise : 'woof'
};
dog.noise = makeNoise(dog.noise);

var cat = {
    raining :false,
    noise : 'meow'
};
cat.makeNoise = makeNoise(cat.noise);

function makeNoise(noise) {
    console.log(noise);
}
cat.raining = true;
massHysteria(dog, cat);
function massHysteria(obj1, obj2){
    if(obj1.raining && obj2.raining){
        console.log('DOGS AND CATS LIVING TOGETHER! MASS HYSTERIA!');
    }
}