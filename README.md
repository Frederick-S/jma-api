# jmo [![Build Status](https://travis-ci.org/Frederick-S/jmo.svg?branch=master)](https://travis-ci.org/Frederick-S/jmo) [![Build status](https://ci.appveyor.com/api/projects/status/cm921ui427s41mk4/branch/master?svg=true)](https://ci.appveyor.com/project/Frederick-S/jmo/branch/master) [![codecov](https://codecov.io/gh/Frederick-S/jmo/branch/master/graph/badge.svg)](https://codecov.io/gh/Frederick-S/jmo) [![codebeat badge](https://codebeat.co/badges/d6e44428-1bb9-43b0-b8e4-a294219e8994)](https://codebeat.co/projects/github-com-frederick-s-jmo-master) [![Maintainability](https://api.codeclimate.com/v1/badges/f5ef3cc799bfeccdec25/maintainability)](https://codeclimate.com/github/Frederick-S/jmo/maintainability)

A web app of Japanese morphological analyzer, powered by [Kuromoji](https://github.com/atilika/kuromoji).

## Request
```http
POST /tokenize HTTP/1.1
Host: example.com
Content-Type: application/json

{
	"text": "もしも自分のことを「馬鹿ブス貧乏」と言われたなら、当然のことながらいい気はしないだろう。"
}
```
