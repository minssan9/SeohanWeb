<template>
	<div class="container" id="app">
		<div class="row panel panel-default panel-body">
			<h3>식단표</h3>
			<input v-model="datepicker" v-on:change="getData" type="date"
				value="datepicker && datepicker.toISOString().split('T')[0]">

			<table class="table table-striped table-bordered ">
				<thead>
					<th class="">구분</th>
					<th class="">메뉴</th>
				</thead>
				<tbody>
					<tr v-for="data in dataList" v-bind:key=data>
						<td class="type"><span
							v-html="data.gubn"></span></td>
						<td>{{data.menu}}</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

</template>

<script>
import foodTableService from '../service/foodTableService';

export default {
			name: 'foodTable',
			data() {
        return{
          datepicker: new Date(),
          querydate: '',
          dataList: []
        };
			},
			methods: {
				getData() {
          this.querydate = this.datepicker.substr(0, 4) + this.datepicker.substr(5, 2) + this.datepicker.substr(8, 2);
          foodTableService.retrieveFoodTable(this.querydate)
          .then(response => {
            this.dataList = response.data;
          })
          .catch(e => {
            console.error(e)
          })
				}
			},
			created() {
				var today = new Date();
				this.querydate = today.getFullYear() + '' + ('00' + (today.getMonth() + 1)).slice(-2) + '' + today.getDate();
				this.datepicker = today.getFullYear() + '-' + ('00' + (today.getMonth() + 1)).slice(-2) + '-' + today.getDate();;
        this.getData();
			},
			mounted: function () {
			},
			computed:{
				genRowspan(className){
				    $("." + className).each(function() {
				        var rows = $("." + className + ":contains('" + $(this).text() + "')");
				        if (rows.length > 1) {
				            rows.eq(0).attr("rowspan", rows.length);
				            rows.not(":eq(0)").remove();
				        }
				    });
				}
			}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
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
