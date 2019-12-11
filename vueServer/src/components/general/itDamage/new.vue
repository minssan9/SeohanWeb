<template>
  <div id="itDamage" class="container">
    등록
    <div id="insertForm" class="col-xs-12 col-sm-12">
      <div class="panel panel-default">
        <form
          action="/general/itdamage/save"
          method="post"
          enctype="multipart/form-data"
        >
          <div class="input-group">
            <label for="fact">공장</label>
            <select
							class="selectpicker form-control" id="fact" v-model="factory" @change="selectFactory(factory)" >
								 <option :selected="true">공장</option>
                  <option v-for="fact in factList" v-bind:key="fact.asgub" v-bind:value="fact.asgub" >{{ fact.asdes }}</option>
						</select>
          </div>
          <div class="input-group">
            <label for="wrkct">라인</label>
            <select
							class="selectpicker form-control" id="line" v-model="line" >
								 <option :selected="true">라인</option>
                <option v-for="line in lineList" v-bind:key="line.asgub" v-bind:value="line.asgub" >{{ line.asdes }}</option>
						</select>
          </div>
          <div class="input-group">
						<label for="class1">고장 유형</label>
            <select
							class="selectpicker form-control" id="class1" v-model="class1" >
								 <option :selected="true">고장 유형</option>
                  <option v-for="data in class1List" v-bind:key="data.asgub" v-bind:value="data.asgub" >{{ data.asdes }}</option>
						</select>
					</div>
          <div class="input-group">
            <label for="rtel">연락처</label>
            <input class="form-control" type="tel" id="rtel" placeholder="010-1234-5678" />
          </div>
          <div class="input-group">
            <label for="rtxt">내용</label>
            <input class="form-control" type="text" id="rtxt" />
          </div>

          <div class="input-group">
            <label for="rtxt">File <button v-on:click="submitFile()">Submit</button></label>
            <input class="form-control"  type="file" id="file" ref="file" v-on:change="handleFileUpload()"/>
          </div>
          <div class="col-md-12 col-sm-12 col-xs-12">
            <button type="submit" class="btn btn-default" onClick="formChk();">확인</button>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import crudService from "@/service/general/crudService";

export default {
  name: "itDamage",
  data() {
    return {
      file: "",
      fiels: "",
      rtime: "",
      factory:'',
      line:'',
      class1:'',
      dataList: [],
      class1List:[],
      factList:[],
      lineList:[],
    };
  },
  methods: {
    save(data) {
      crudService.setRoute('general/itdamage');
      crudService.save(data)
      .then(() => {
        this.getData();
      })
      .catch(e => {
        console.log(e);
      });
    },
    submitFile() {
      let formData = new FormData();
      formData.append("file", this.file);
      // for( var i = 0; i < this.files.length; i++ ){
      //   let file = this.files[i];

      //   formData.append('files[' + i + ']', file);
      // }

      axios
      .post("/api/file/upload", formData, {
        headers: {
          "Content-Type": "multipart/form-data"
        }
      })
      .then(function() {
        console.log("SUCCESS!!");
      })
      .catch(function() {
        console.log("FAILURE!!");
      });
    },
    handleFileUpload() {
      this.file = this.$refs.file.files[0];
    },
    handleFilesUpload() {
      this.files = this.$refs.files.files;
    },
    fileDown(data) {
      window.open("/api/file/" + data.attach);
    },
    selectFactory(factory){
      crudService.setRoute('general/codeLib');
      crudService.getLineList(factory)
      .then(response => {
        this.lineList = response.data;
        console.log(response);
      })
      .catch(e => {
        console.log(e);
      });;;
    }
  },
  created() {
    crudService.setRoute('general/codeLib');
    crudService.retrieve("IT")
    .then(response => {
      this.class1List = response.data;
      console.log(response);
    })
    .catch(e => {
      console.log(e);
    });;
    crudService.retrieve("31")
    .then(response => {
      this.factList = response.data;
      console.log(response);
    })
    .catch(e => {
      console.log(e);
    });;
  },
  mounted: function() {}
};
</script>

