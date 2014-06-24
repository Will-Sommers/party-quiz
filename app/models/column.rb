class Column < ActiveRecord::Base

  belongs_to :board
  has_many :cards

  validates :name, presence: true
  validates :board, prescence: true
end
