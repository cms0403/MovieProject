const Searching = Search.prototype;
function Search() {
    this.keyword = document.querySelector('input[name = "search]');
    this.engine = document.querySelector('.SelectSearch');
    this.button = document.querySelector('.img-button');
    this.form = document.querySelector('.search');
    this.Engine();
}
Searching.Engine = function() {
    this.form.addEventListner('submit', e => {
        e.preventDefault();
        let engine = this.engine.value;
        let keyword = this.keyword.value;
        if(engine === 'select') {
            location.href = '' + keyword;
        } else if(engine === 'director') {
            location.href = '' + keyword;
        } else if(engine === 'actor') {
            location.href = '' + keyword;
        } else if(engine === 'moviename') {
            location.href = '' + keyword;
        }
    });
}
new Search();