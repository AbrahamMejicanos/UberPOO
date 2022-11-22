<?php
    class Account{
        private $id, $document, $email, $password, $name;

        public function __construct($name, $document)
        {
            $this->name = $name;
            $this->document = $document;
        }

        public function _getName(){
            return $this->name;
        }

        public function _getDocument(){
            return $this->document;
        }
    }
?>