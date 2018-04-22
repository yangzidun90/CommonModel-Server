CREATE TABLE `common_dxmodel` (
  `id` varchar(32) NOT NULL DEFAULT '',
  `modelType` varchar(10) DEFAULT NULL,
  `modelName` varchar(50) DEFAULT NULL,
  `createTime` date DEFAULT NULL,
  `lastTime` date DEFAULT NULL,
  `state` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
