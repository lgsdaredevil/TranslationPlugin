package cn.yiiguxing.plugin.translate.action

import cn.yiiguxing.plugin.translate.ui.icon.Icons
import cn.yiiguxing.plugin.translate.util.Settings

/**
 * 翻译动作，自动从最大范围内取词，优先选择
 */
class EditorTranslateAction : TranslateAction(true, Icons.Translate) {

    override val selectionMode
        get() = Settings.autoSelectionMode

}
