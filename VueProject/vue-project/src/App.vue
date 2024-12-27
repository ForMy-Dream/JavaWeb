<template>
  <div>
   <!-- <my-button></my-button> -->
    <emp-view></emp-view>
  </div>
</template>

<script>
//import EmpView from './views/myView/EmpView.vue';
// import MyButton from './views/element/MyButton.vue';
export default {
  components: {/* EmpView */ /* MyButton */ },
  name: 'App',
  mounted() {
    //this.getData();
  },
  data() {
    return {
      msg:"Hello World!!"
    }
  },
  methods: {
      getData() {
        alert(this.msg);
      }
    }
}
// app.vue写在script里面  main.js写在app挂载完之后
const debounce = (fn, delay) => {
  let timer
   return (...args) => {
     if (timer) {
       clearTimeout(timer)
     }
     timer = setTimeout(() => {
       fn(...args)
     }, delay)
   }
}
const _ResizeObserver = window.ResizeObserver;
window.ResizeObserver = class ResizeObserver extends _ResizeObserver{
   constructor(callback) {
     callback = debounce(callback, 200);
     super(callback);
   }
}
</script>
<style></style>
