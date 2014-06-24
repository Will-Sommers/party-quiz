class Board < ActiveRecord::Base

  has_many :games
  has_many :columns
  has_many :answers

  validates :name, presence: true
end
