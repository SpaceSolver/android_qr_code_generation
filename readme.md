# QRコードの生成

# 概観

* 世にあるQRコードライブラリを利用
   * ZXing
      * https://qiita.com/hoshiume11/items/0f496fe80df84875c132
   * サイトには`build.gradle`で`compile`指定しているが、`implementation`にする
      * (最近のAndrdoid versionでそうなったのかしら？)
   * API自体は`BarcodeEncoder#encodeBitmap`を使うだけ。

# アプリの説明

* [GENERATE]ボタン
   * ボタン下のtext windowの内容をQRコードにエンコードし、
   * 最下部のimage view上にQRコードを表示する
* [RESET]ボタン
   * text windowとimage view表示をクリアする
   * デフォルトのtextはソルバのアドレス
* [TEST]ボタン
   * image viewの操作がよくわからなかったのでその確認用のボタン
   * app埋め込みの画像をimage view上に表示するだけのボタン
