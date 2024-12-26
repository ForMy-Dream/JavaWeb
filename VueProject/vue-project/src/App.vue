<template>
  <div>
   <my-button></my-button>
  </div>
</template>

<script>
import MyButton from './views/element/MyButton.vue';
export default {
  components: { MyButton },
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
</script>
<style></style>
