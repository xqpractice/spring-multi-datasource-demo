CREATE TABLE `user` (
  `id`      BIGINT(21) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name`    VARCHAR(20) NOT NULL COMMENT '姓名',
  `age`     INT(5) DEFAULT NULL COMMENT '年龄',
  `updated_at`  DATETIME NOT NULL,
  `updated_by`  VARCHAR(20) NOT NULL,
  `created_at`  DATETIME NOT NULL,
  `created_by`  VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;