<template>
  <div class="container" id="app">
    <div class="row panel panel-default panel-body">
      <div>
        <h3>식단표</h3>
          <button class="btn btn-default" v-on:click="seohanFoodTable">서한</button>
          <button class="btn btn-default" v-on:click="kamtecFoodTable">캄텍</button>
          <button class="btn btn-default" v-on:click="labFoodTable">연구소</button>
        <input class="form-control"
          v-model="datepicker"
          v-on:change="foodTable"
          type="date"
          value="datepicker && datepicker.toISOString().split('T')[0]"
        />

      </div>
        <table class="table table-striped table-bordered">
          <thead>
            <th class>구분</th>
            <th class>메뉴</th>
          </thead>
          <tbody>
            <tr v-for="data in dataList" v-bind:key="data">
              <td >{{data.gubn}}</td>
              <td>{{data.menu}}</td>
            </tr>
          </tbody>
        </table>
    </div>
  </div>
</template>

<script>
import foodTableService from "@/service/general/foodTableService";

export default {
  name: "foodTable",
  data() {
    return {
      datepicker: new Date(),
      querydate: "",
      company: "",
      dataList: []
    };
  },
  methods: {
    foodTable() {
      this.querydate =this.datepicker.substr(0, 4) +this.datepicker.substr(5, 2) +this.datepicker.substr(8, 2);
      foodTableService
        .foodTable(this.querydate, this.company)
        .then(response => {
          response.data.forEach(function(item) {
            switch (item.gubn) {
              case "A":
                item.gubn = "아침";
                break;
              case "B":
                item.gubn = "점심";
                break;
              case "C":
                item.gubn = "저녁";
                break;
              case "D":
                item.gubn = "야식";
                break;
            }
          });
          this.dataList = response.data;
        })
        .catch(e => {
          console.error(e);
        });
    },
    seohanFoodTable(){
      this.company = 'seohan';
      this.foodTable();
    },
    kamtecFoodTable(){
      this.company = 'kamtec';
      this.foodTable();
    },
    labFoodTable(){
      this.company = 'lab';
      this.foodTable();
    },
  },
  created() {
    var today = new Date();
    this.datepicker =
      today.getFullYear() + "-" +("00" + (today.getMonth() + 1)).slice(-2) +"-" +("00" + today.getDate()).slice(-2);
    this.seohanFoodTable();
  },
  mounted: function() {},
  computed: {}
};
</script>

