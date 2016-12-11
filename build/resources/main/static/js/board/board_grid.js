$(function(){
    console.log("board_grid.js");

    fn_makeGrid();
});

function fn_makeGrid(){
    $Grid = $("#myGrid");
    $Grid.jqGrid({
        url: '/selectBoard_json',
        datatype: "json",
        mtype: "get",
        height: "700",
        autowidth: true,
        rownumbers:true,
        /*jsonReader: {
         root: "boardVO"
         },*/
        rowNum: "20",
        rowList: [10,20,50],
        pager:'#pager1',
        colNames:[
            'seq',
            '성별',
            '지역',
            '부서코드',
            '제목',
            '조회수'
        ],
        colModel: [
            {name:"seq", width:40, align:"center"},
            {name:"sex", width:80, align:"left"},
            {name:"local", width:80, align:"left"},
            {name:"deptno",width:20, align:"center"},
            {name:"title", width:80, align:"right"},
            {name:"hit", width:80, align:"right"}
        ],
        multiselect: true,
        sortname: "seq",
        jsonReader: {
            repeatitems:false

        }
        /*  postData: {
         id: "id",
         name: "name"
         }*/
    });
    //$("#list2").jqGrid('navGrid','#pager1',{edit:false,add:false,del:false});
}