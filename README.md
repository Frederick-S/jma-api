# jma-api [![Build Status](https://travis-ci.org/Frederick-S/jma-api.svg?branch=master)](https://travis-ci.org/Frederick-S/jma-api) [![Build status](https://ci.appveyor.com/api/projects/status/a238s38syq2lo31f/branch/master?svg=true)](https://ci.appveyor.com/project/Frederick-S/jma-api/branch/master) [![codecov](https://codecov.io/gh/Frederick-S/jma-api/branch/master/graph/badge.svg)](https://codecov.io/gh/Frederick-S/jma-api) [![Maintainability](https://api.codeclimate.com/v1/badges/3cb324259466714c56e8/maintainability)](https://codeclimate.com/github/Frederick-S/jma-api/maintainability)

An api service of Japanese morphological analyzer, powered by [Kuromoji](https://github.com/atilika/kuromoji), the server side of [jma-web](https://github.com/Frederick-S/jma-web).

## Example
### Request
```http
POST /tokenize HTTP/1.1
Host: example.com
Content-Type: application/json

{
	"text": "吾輩は猫である"
}
```

### Response
```json
[
    {
        "surface": "吾輩",
        "position": 0,
        "partOfSpeechLevel1": "名詞",
        "partOfSpeechLevel2": "代名詞",
        "partOfSpeechLevel3": "一般",
        "partOfSpeechLevel4": "*",
        "conjugationType": "*",
        "conjugationForm": "*",
        "reading": "ワガハイ",
        "baseForm": "吾輩",
        "pronunciation": "ワガハイ",
        "user": false,
        "allFeatures": "名詞,代名詞,一般,*,*,*,吾輩,ワガハイ,ワガハイ",
        "allFeaturesArray": [
            "名詞",
            "代名詞",
            "一般",
            "*",
            "*",
            "*",
            "吾輩",
            "ワガハイ",
            "ワガハイ"
        ],
        "known": true
    },
    {
        "surface": "は",
        "position": 2,
        "partOfSpeechLevel1": "助詞",
        "partOfSpeechLevel2": "係助詞",
        "partOfSpeechLevel3": "*",
        "partOfSpeechLevel4": "*",
        "conjugationType": "*",
        "conjugationForm": "*",
        "reading": "ハ",
        "baseForm": "は",
        "pronunciation": "ワ",
        "user": false,
        "allFeatures": "助詞,係助詞,*,*,*,*,は,ハ,ワ",
        "allFeaturesArray": [
            "助詞",
            "係助詞",
            "*",
            "*",
            "*",
            "*",
            "は",
            "ハ",
            "ワ"
        ],
        "known": true
    },
    {
        "surface": "猫",
        "position": 3,
        "partOfSpeechLevel1": "名詞",
        "partOfSpeechLevel2": "一般",
        "partOfSpeechLevel3": "*",
        "partOfSpeechLevel4": "*",
        "conjugationType": "*",
        "conjugationForm": "*",
        "reading": "ネコ",
        "baseForm": "猫",
        "pronunciation": "ネコ",
        "user": false,
        "allFeatures": "名詞,一般,*,*,*,*,猫,ネコ,ネコ",
        "allFeaturesArray": [
            "名詞",
            "一般",
            "*",
            "*",
            "*",
            "*",
            "猫",
            "ネコ",
            "ネコ"
        ],
        "known": true
    },
    {
        "surface": "で",
        "position": 4,
        "partOfSpeechLevel1": "助動詞",
        "partOfSpeechLevel2": "*",
        "partOfSpeechLevel3": "*",
        "partOfSpeechLevel4": "*",
        "conjugationType": "特殊・ダ",
        "conjugationForm": "連用形",
        "reading": "デ",
        "baseForm": "だ",
        "pronunciation": "デ",
        "user": false,
        "allFeatures": "助動詞,*,*,*,特殊・ダ,連用形,だ,デ,デ",
        "allFeaturesArray": [
            "助動詞",
            "*",
            "*",
            "*",
            "特殊・ダ",
            "連用形",
            "だ",
            "デ",
            "デ"
        ],
        "known": true
    },
    {
        "surface": "ある",
        "position": 5,
        "partOfSpeechLevel1": "助動詞",
        "partOfSpeechLevel2": "*",
        "partOfSpeechLevel3": "*",
        "partOfSpeechLevel4": "*",
        "conjugationType": "五段・ラ行アル",
        "conjugationForm": "基本形",
        "reading": "アル",
        "baseForm": "ある",
        "pronunciation": "アル",
        "user": false,
        "allFeatures": "助動詞,*,*,*,五段・ラ行アル,基本形,ある,アル,アル",
        "allFeaturesArray": [
            "助動詞",
            "*",
            "*",
            "*",
            "五段・ラ行アル",
            "基本形",
            "ある",
            "アル",
            "アル"
        ],
        "known": true
    }
]
```
