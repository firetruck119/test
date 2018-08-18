var $j = jQuery.noConflict();
//IE支持placeholder
var JPlaceHolder = {
    //检测
    _check: function () {
        return 'placeholder' in document.createElement('input');
    },
    //初始化
    init: function () {
        if (!this._check()) {
            this.fix();
        }
    },
    //修复
    fix: function () {
        jQuery(':input[placeholder]').each(function (index, element) {
            var self = $j(this), txt = self.attr('placeholder');
            self.wrap($j('<div></div>').css({ 'position': 'relative', 'zoom': '1', 'border': 'none', 'background': 'none', 'padding': 'none', 'margin': 'none','display':'inline','line-height':'24px' }));
            var pos = self.position(), h = self.outerHeight(true), paddingleft = self.css('padding-left');
            var holder = $j('<span></span>').text(txt).css({ position: 'absolute', left: pos.left, top: pos.top, height: h, lienHeight: h, paddingLeft: paddingleft, color: '#aaa' }).appendTo(self.parent());

            self.focusin(function (e) {           
                holder.hide();
            }).focusout(function (e) {
                if (!self.val()) {
                    holder.show();
                }

            });
            holder.click(function (e) {
                holder.hide();
                self.focus();
            });

            if (self.val()) {
                holder.hide();
            }
        });
    }
};
//执行
jQuery(function () {
    JPlaceHolder.init();
});