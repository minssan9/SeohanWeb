<template>
  <div id="itDamage" class="container">
    등록
		<div id="insertForm" class=" col-xs-12 col-sm-12">
			<div class="panel panel-default ">

				<form action="/insertbook" method="post" class="panel-body"
					enctype="multipart/form-data" name="insertForm">

					<b-form-group>
						<label style="width:10%;" for="exampleInputEmail1">ISBN</label> <input style="width:70%; display:-webkit-inline-box;"
							 class="form-control" type="text" id="isbn"
							name="isbn"  >
            <button style="width:10%" class="btn btn-default" type="button" id="getBookFromISBN">
              <span class="glyphicon glyphicon-search"></span>
            </button>
					</b-form-group>
					<b-form-group>
						<label for="exampleInputEmail1">도서번호</label> <input type="text"
							class="form-control" id="book_cd" name="book_cd"
							required="required"  >
					</b-form-group>
					<b-form-group>
						<label for="exampleInputPassword1">도서명</label> <input type="text"
							class="form-control" id="title" name="title" placeholder="도서명"
							required="required">
					</b-form-group>
					<!-- <div class="col-md-7 col-sm-7	col-xs-7 left">
						<label for="exampleInputPassword1">대분류</label> <select
							class="selectpicker form-control"
							style="font-size: 14px; margin-top: 10px; vertical-align: baseline;"
							id="b_group" name="b_group">
							<c:forEach items="${BCodeList}" var="code">
								<option value="${code.code}-${code.name}">${code.code}-${code.name}
							</c:forEach>
						</select>
					</b-form-group>
					<div class="col-md-5 col-sm-5	col-xs-5 right">
						<label for="exampleInputPassword1">소분류</label> <select
							class="selectpicker form-control"
							style="font-size: 14px; margin-top: 10px; vertical-align: baseline;"
							id="c_group" name="c_group">
							<c:forEach items="${CCodeList}" var="code">
								<option value="${code.code}-${code.name}">${code.code}-${code.name}
							</c:forEach>
						</select>
					</b-form-group> -->
					<div class="col-md-6 col-sm-6	col-xs-6">
						<label for="exampleInputPassword1">출판사</label> <input type="text"
							class="form-control" id="publish" name="publish"
							placeholder="출판사" required="required">
					</div>
					<div class="col-md-6 col-sm-6	col-xs-6">
						<label for="exampleInputPassword1">저자</label> <input type="text"
							class="form-control" id="author" name="author" placeholder="저자">
					</div>
					<b-form-group>
						<label for="exampleInputPassword1">요약</label> <input type="text"
							class="form-control" id="summary" name="summary" placeholder="요약">
					</b-form-group>
					<b-form-group>
						<label for="exampleInputPassword1">가격</label><input type="number"
							class="form-control" name="price" id="price" placeholder="0"
							required="required">
					</b-form-group>
					<div class="form-group file">
						<label for="exampleInputPassword1">파일</label> <input type="file"
 						class="form-control" id="file" name="file" placeholder="파일">
            <label>File
              <input type="file" id="file" ref="file" v-on:change="handleFileUpload()"/>
            </label>
              <button v-on:click="submitFile()">Submit</button>
					</div>
					<div class="col-md-12 col-sm-12 col-xs-12">
						<button type="submit" class="btn btn-default"
							onClick="formChk();  ">확인</button>
					</div>
				</form>
			</div>
		</div>
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
