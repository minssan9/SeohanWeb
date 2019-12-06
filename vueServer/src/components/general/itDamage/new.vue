<template>
  <div id="itDamage" class="container">
    등록
      <label>File
        <input type="file" id="file" ref="file" v-on:change="handleFileUpload()"/>
      </label>
        <button v-on:click="submitFile()">Submit</button>
  </div>
</template>

<script>
import itDamageService from "../../../service/general/itDamageService";

export default {
  name: "itDamage",
  data() {
    return {
      file:'',
      fiels:'',
      rtime: '',
      dataList: []
    };
  },
  methods: {
    getData() {
      itDamageService
        .retrieve(rtime)
        .then(response => {
          this.dataList = response.data;
          console.log(response);
        })
        .catch(e => {
          console.log(e);
        });
    },
    save(data) {

      itDamageService
        .save(data)
        .then(() => {
          this.getData();
        })
        .catch(e => {
          console.log(e);
        });


    },
    handleFileUpload(){
      this.file = this.$refs.file.files[0];
    },
    handleFilesUpload(){
      this.files = this.$refs.files.files;
    },
    submitFile(){
      let formData = new FormData();
      formData.append('file', this.file);

      // for( var i = 0; i < this.files.length; i++ ){
      //   let file = this.files[i];

      //   formData.append('files[' + i + ']', file);
      // }

      axios.post( '/single-file',
        formData,
        {
          headers: {
              'Content-Type': 'multipart/form-data'
          }
        }
      ).then(function(){
        console.log('SUCCESS!!');
      })
      .catch(function(){
        console.log('FAILURE!!');
      });
    },
    fileUpload(){
      this.file = this.$refs.file.files[0];
    },
    fileDown(data) {
      window.open("/api/file/" + data.attach);
    }
  },
  created() {
    this.getData();
  },
  mounted: function() {}
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
