/**var skills = [
	{label: 'Java', value:85},
	{label: 'Php', value:65},
	{label: 'JavaScript', value:75},
	{label: 'Html / Css', value:80},
	{label: 'BDD', value:55}
]**/

Vue.component('polygraph', {
	props: ['skills'],
	template: '#polygraph-template',
	computed: {
		points: function(){
			let total = this.skills.length
			return this.skills.map(function(skill, i) {
				var point = valueToPoint(skill.value +10, i, total)
				return point.x + ',' + point.y
			}).join(' ');
		}
	},
	components: {
		// Label subcomponent
		'axis-label': {
			props: {
				skill: Object,
				index: Number,
				total: Number
			},
			template: '#axis-label-template',
			methods: {
				labelSelect: function(){
					bus.$emit("labelSelected", this.index);
				}
			},
			computed: {
				point: function(){
					return valueToPoint(
					+this.skill.value + 10,
					this.index,
					this.total
					)
				}
			}
		}
	}
})

// Points coordinate calculator
function valueToPoint (value, index, total) {
	var x     = 0
	var y     = -value * 0.8
	var angle = Math.PI * 2 / total * index
	var cos   = Math.cos(angle)
	var sin   = Math.sin(angle)
	var tx    = x * cos - y * sin + 100
	var ty    = x * sin + y * cos + 100
	return {
	  x: tx,
	  y: ty
	}
  }

var bus = new Vue();

window.onload = function () {
    var main = new Vue({
		el: '#skillDiag',
		data: {
			skills: skills
		},
		created() {
			bus.$on('labelSelected', function (index) {
				var skill = self.skills[index];
				self.skills.splice(index, 1);
				self.skills.unshift(skill);
			})
		}
	})
}